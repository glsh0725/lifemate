<!-- header.jsp -->
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title><%= request.getAttribute("pageTitle") != null ? request.getAttribute("pageTitle") : "Default Title" %></title>
    <link rel="stylesheet" href="/css/style.css">
    <script src="/js/script.js"></script>
</head>
<body>
    <header>
        <div class="logo">
            <a href="/index.jsp"><img src="/images/logo.png" alt="Logo"></a>
        </div>
        <nav>
            <ul>
                <li><a href="/home.jsp">Home</a></li>
                <li><a href="/about.jsp">About</a></li>
                <li><a href="/contact.jsp">Contact</a></li>
                <li><a href="/login.jsp">Login</a></li>
            </ul>
        </nav>
    </header>
</body>
</html>