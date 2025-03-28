document.addEventListener("DOMContentLoaded", () => {
    const modal = document.getElementById("mate-modal");
    const tableBody = document.querySelector("table tbody");
    const regionButtons = document.querySelectorAll(".region-button");
    const searchInput = document.getElementById("search-input");
    const searchButton = document.getElementById("search-button");
    const infantButton = document.getElementById("infant-button");
    const petButton = document.getElementById("pet-button");
    const paginationContainer = document.createElement("div");
    paginationContainer.className = "pagination";
    tableBody.parentElement.appendChild(paginationContainer);

    let currentPage = 1;
    const itemsPerPage = 10;
    const pagesPerGroup = 10;
    let totalPages = 1;
    let totalGroups = 1;
    let currentGroup = 1;
    let allData = [];
    let filteredData = [];

    function getFilteredData() {
        const activeRegionButton = document.querySelector(".region-button.active");
        let regionFilteredData = allData;

        if (activeRegionButton && activeRegionButton.value !== "전국") {
            const selectedRegion = activeRegionButton.value.toLowerCase();
            regionFilteredData = allData.filter(mate =>
                mate.city.toLowerCase().includes(selectedRegion)
            );
        }

        if (infantButton.classList.contains("active") && petButton.classList.contains("active")) {
            return regionFilteredData.filter(mate => mate.kidZone === "Y" && mate.petFriendly === "Y");
        } else if (infantButton.classList.contains("active")) {
            return regionFilteredData.filter(mate => mate.kidZone === "Y");
        } else if (petButton.classList.contains("active")) {
            return regionFilteredData.filter(mate => mate.petFriendly === "Y");
        } else {
            return regionFilteredData;
        }
    }

    regionButtons.forEach(button => {
        button.addEventListener("click", () => {
            regionButtons.forEach(btn => btn.classList.remove("active"));
            button.classList.add("active");

            filteredData = getFilteredData();
            currentPage = 1;
            currentGroup = 1;
            totalPages = Math.ceil(filteredData.length / itemsPerPage);
            totalGroups = Math.ceil(totalPages / pagesPerGroup);
            renderTable(currentPage);
            renderPagination();
        });
    });

    const defaultRegionButton = document.querySelector(".region-button[value='전국']");
    if (defaultRegionButton) {
        defaultRegionButton.classList.add("active");
    }

     searchButton.addEventListener("click", () => {
        const searchTerm = searchInput.value.trim().toLowerCase();
        if (searchTerm) {
            filteredData = filteredData.filter(mate =>
                mate.facilityName.toLowerCase().includes(searchTerm)
            );
        } else {
            filteredData = getFilteredData();
        }
        currentPage = 1;
        currentGroup = 1;
        totalPages = Math.ceil(filteredData.length / itemsPerPage);
        totalGroups = Math.ceil(totalPages / pagesPerGroup);
        renderTable(currentPage);
        renderPagination();
    });

    searchInput.addEventListener("keyup", (event) => {
        if (event.key === "Enter") {
            searchButton.click();
        }
    });

    function handleButtonClick(button) {
        button.classList.toggle("active");
        filteredData = getFilteredData();
        currentPage = 1;
        currentGroup = 1;
        totalPages = Math.ceil(filteredData.length / itemsPerPage);
        totalGroups = Math.ceil(totalPages / pagesPerGroup);
        renderTable(currentPage);
        renderPagination();
    }

    infantButton.addEventListener("click", () => handleButtonClick(infantButton));
    petButton.addEventListener("click", () => handleButtonClick(petButton));

    fetch(`${contextPath}/api/mate/combined`)
        .then(response => {
            if (!response.ok) {
                throw new Error("Network response was not ok");
            }
            return response.json();
        })
        .then(data => {
            allData = data;
            filteredData = allData;
            totalPages = Math.ceil(filteredData.length / itemsPerPage);
            totalGroups = Math.ceil(totalPages / pagesPerGroup);
            renderTable(currentPage);
            renderPagination();
        })
        .catch(error => {
            console.error("Error fetching combined data:", error);
            tableBody.innerHTML = `<tr><td colspan="5">데이터를 불러오는 중 오류가 발생했습니다.</td></tr>`;
        });

    function renderTable(page) {
        tableBody.innerHTML = "";
        const startIndex = (page - 1) * itemsPerPage;
        const endIndex = Math.min(startIndex + itemsPerPage, filteredData.length);
        const pageData = filteredData.slice(startIndex, endIndex);

        pageData.forEach(mate => {
            const row = document.createElement("tr");
            row.innerHTML = `
                <td>${mate.facilityName}</td>
                <td>${mate.city} ${mate.cityDistrict}</td>
                <td>${mate.holiday}</td>
                <td>
                    <button class="view-details-btn" data-facility="${mate.facilityName}">자세히보기</button>
                </td>
            `;
            tableBody.appendChild(row);

            row.querySelector(".view-details-btn").addEventListener("click", () => {
                const detailsContent = `
                    <span class="close-btn">X</span>
                    <h2>${mate.facilityName}</h2>
                    <p><strong>전화번호:</strong> ${mate.contact || "정보없음"}</p>
                    <p><strong>지번주소:</strong> ${mate.oldAddress || "정보없음"}</p>
                    <p><strong>도로명주소:</strong> ${mate.newAddress || "정보없음"}</p>
                    <p>
                        <strong>홈페이지:</strong>
                        ${
                            mate.url?.trim() && mate.url !== "정보없음"
                                ? `<a id="homepage-link" href="${mate.url}" target="_blank">${mate.url}</a>`
                                : mate.blogUrl?.trim() && mate.blogUrl !== "정보없음"
                                ? `<a id="blog-link" href="${mate.blogUrl}" target="_blank">${mate.blogUrl}</a>`
                                : mate.facebookUrl?.trim() && mate.facebookUrl !== "정보없음"
                                ? `<a id="facebook-link" href="${mate.facebookUrl}" target="_blank">${mate.facebookUrl}</a>`
                                : mate.instargramUrl?.trim() && mate.instargramUrl !== "정보없음"
                                ? `<a id="instagram-link" href="${mate.instargramUrl}" target="_blank">${mate.instargramUrl}</a>`
                                : "정보없음"
                        }
                    </p>
                    <p><strong>운영시간:</strong> ${mate.businessHours || "정보없음"}</p>
                    <p><strong>휴무일:</strong> ${mate.holiday || "정보없음"}</p>
                    <p><strong>입장료:</strong> ${mate.entryFee || "정보없음"}</p>
                `;

                const kidZoneContent = mate.kidZone === "Y" ? `
                    <p><strong>무료주차:</strong> ${mate.freeParking || "정보없음"}</p>
                    <p><strong>유료주차:</strong> ${mate.paidParking || "정보없음"}</p>
                    <p><strong>입장 가능 나이:</strong> ${mate.entryAge || "정보없음"}</p>
                    <p><strong>가족 화장실:</strong> ${mate.familyToilet || "정보없음"}</p>
                    <p><strong>유모차 대여:</strong> ${mate.strollerRental || "정보없음"}</p>
                    <p><strong>수유실:</strong> ${mate.nursingRoom || "정보없음"}</p>
                    <p><strong>키즈존:</strong> ${mate.kidZone || "정보없음"}</p>
                ` : "";

                const petFriendlyContent = mate.petFriendly === "Y" ? `
                    <p><strong>애견 동반 추가 요금:</strong> ${mate.petCompanionFee || "정보없음"}</p>
                    <p><strong>반려동물 제한사항:</strong> ${mate.petRestrictions || "정보없음"}</p>
                    <p><strong>주차 가능 여부:</strong> ${mate.parking || "정보없음"}</p>
                    <p><strong>실내 장소:</strong> ${mate.indoor || "정보없음"}</p>
                    <p><strong>실외 장소:</strong> ${mate.outdoor || "정보없음"}</p>
                    <p><strong>입장 가능 동물 크기:</strong> ${mate.petSize || "정보없음"}</p>
                    <p><strong>반려동물 동반 가능:</strong> ${mate.petFriendly || "정보없음"}</p>
                ` : "";

                modal.querySelector(".modal-content").innerHTML = detailsContent + kidZoneContent + petFriendlyContent;
                modal.querySelector(".close-btn").addEventListener("click", () => {
                    modal.style.display = "none";
                });
                modal.addEventListener("click", (event) => {
                    if (event.target === modal) {
                        modal.style.display = "none";
                    }
                });
                modal.style.display = "block";
            });
        });
    }

    function renderPagination() {
        paginationContainer.innerHTML = "";

        const startPage = (currentGroup - 1) * pagesPerGroup + 1;
        const endPage = Math.min(startPage + pagesPerGroup - 1, totalPages);

        if (currentGroup > 1) {
            const prevButton = document.createElement("a");
            prevButton.href = "#";
            prevButton.textContent = "이전";
            prevButton.addEventListener("click", (event) => {
                event.preventDefault();
                currentGroup--;
                currentPage = (currentGroup - 1) * pagesPerGroup + 1;
                renderTable(currentPage);
                renderPagination();
            });
            paginationContainer.appendChild(prevButton);
        }

        for (let i = startPage; i <= endPage; i++) {
            const pageLink = document.createElement("a");
            pageLink.textContent = i;
            pageLink.href = "#";
            if (i === currentPage) {
                pageLink.classList.add("active");
            }

            pageLink.addEventListener("click", (event) => {
                event.preventDefault();
                currentPage = i;
                renderTable(currentPage);
                renderPagination();
            });

            paginationContainer.appendChild(pageLink);
        }

        if (currentGroup < totalGroups) {
            const nextButton = document.createElement("a");
            nextButton.href = "#";
            nextButton.textContent = "다음";
            nextButton.addEventListener("click", (event) => {
                event.preventDefault();
                currentGroup++;
                currentPage = (currentGroup - 1) * pagesPerGroup + 1;
                renderTable(currentPage);
                renderPagination();
            });
            paginationContainer.appendChild(nextButton);
        }
    }
});