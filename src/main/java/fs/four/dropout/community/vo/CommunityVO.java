package fs.four.dropout.community.vo;


import fs.four.dropout.admin.vo.AdminVO;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Component;

import java.sql.Timestamp;
import java.util.Date;

@Component("communityVO")
public class CommunityVO extends AdminVO {

    private int com_post_number;
    private String usr_id;
    private String com_title;
    private String com_thumbnail_name;
    private String com_thumbnail_path;
    private String com_location;
    private String com_duration;
    private String com_image_name;
    private String com_image_path;
    private String com_video_name;
    private String com_video_path;
    private String com_content;
    private String usr_nickname;
    private Number com_view_count;
    private Number com_like_count;
    private Number com_report_count;
    private Number com_comment_count;
    private Timestamp com_created_date;
    private String com_updated_id;
    private Timestamp com_updated_date;
    @DateTimeFormat(pattern = "YYYY-MM-DD")
    private String com_post_date;

    public CommunityVO() {

    }

    public int getCom_post_number() {
        return com_post_number;
    }

    public void setCom_post_number(int com_post_number) {
        this.com_post_number = com_post_number;
    }

    public String getUsr_id() {
        return usr_id;
    }

    public void setUsr_id(String usr_id) {
        this.usr_id = usr_id;
    }

    public String getCom_title() {
        return com_title;
    }

    public void setCom_title(String com_title) {
        this.com_title = com_title;
    }

    public String getCom_thumbnail_name() {
        return com_thumbnail_name;
    }

    public void setCom_thumbnail_name(String com_thumbnail_name) {
        this.com_thumbnail_name = com_thumbnail_name;
    }

    public String getCom_thumbnail_path() {
        return com_thumbnail_path;
    }

    public void setCom_thumbnail_path(String com_thumbnail_path) {
        this.com_thumbnail_path = com_thumbnail_path;
    }

    public String getCom_location() {
        return com_location;
    }

    public void setCom_location(String com_location) {
        this.com_location = com_location;
    }

    public String getCom_duration() {
        return com_duration;
    }

    public void setCom_duration(String com_duration) {
        this.com_duration = com_duration;
    }

    public String getCom_image_name() {
        return com_image_name;
    }

    public void setCom_image_name(String com_image_name) {
        this.com_image_name = com_image_name;
    }

    public String getCom_image_path() {
        return com_image_path;
    }

    public void setCom_image_path(String com_image_path) {
        this.com_image_path = com_image_path;
    }

    public String getCom_video_name() {
        return com_video_name;
    }

    public void setCom_video_name(String com_video_name) {
        this.com_video_name = com_video_name;
    }

    public String getCom_video_path() {
        return com_video_path;
    }

    public void setCom_video_path(String com_video_path) {
        this.com_video_path = com_video_path;
    }

    public String getCom_content() {
        return com_content;
    }

    public void setCom_content(String com_content) {
        this.com_content = com_content;
    }

    public String getUsr_nickname() {
        return usr_nickname;
    }

    public void setUsr_nickname(String usr_nickname) {
        this.usr_nickname = usr_nickname;
    }

    public Number getCom_view_count() {
        return com_view_count;
    }

    public void setCom_view_count(Number com_view_count) {
        this.com_view_count = com_view_count;
    }

    public Number getCom_like_count() {
        return com_like_count;
    }

    public void setCom_like_count(Number com_like_count) {
        this.com_like_count = com_like_count;
    }

    public Number getCom_report_count() {
        return com_report_count;
    }

    public void setCom_report_count(Number com_report_count) {
        this.com_report_count = com_report_count;
    }

    public Number getCom_comment_count() {
        return com_comment_count;
    }

    public void setCom_comment_count(Number com_comment_count) {
        this.com_comment_count = com_comment_count;
    }

    public Timestamp getCom_created_date() {
        return com_created_date;
    }

    public void setCom_created_date(Timestamp com_created_date) {
        this.com_created_date = com_created_date;
    }

    public String getCom_updated_id() {
        return com_updated_id;
    }

    public void setCom_updated_id(String com_updated_id) {
        this.com_updated_id = com_updated_id;
    }

    public Timestamp getCom_updated_date() {
        return com_updated_date;
    }

    public void setCom_updated_date(Timestamp com_updated_date) {
        this.com_updated_date = com_updated_date;
    }

//    public Date getCom_post_date() {
//        return com_post_date;
//    }
//
//    public void setCom_post_date(Date com_post_date) {
//        this.com_post_date = com_post_date;
//    }


    public String getCom_post_date() {
        return com_post_date;
    }

    public void setCom_post_date(String com_post_date) {
        this.com_post_date = com_post_date;
    }
}


