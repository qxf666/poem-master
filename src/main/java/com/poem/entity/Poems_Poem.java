package com.poem.entity;

public class Poems_Poem {

    private int id;
    private String uid;
    private String name;
    private int dynastyid;
    private int typeid;
    private int authoruid;
    private String content;
    private String annotation;
    private String translation;
    private String workintro;
    private String richtext;
    private String memo;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDynastyid() {
        return dynastyid;
    }

    public void setDynastyid(int dynastyid) {
        this.dynastyid = dynastyid;
    }

    public int getTypeid() {
        return typeid;
    }

    public void setTypeid(int typeid) {
        this.typeid = typeid;
    }

    public int getAuthoruid() {
        return authoruid;
    }

    public void setAuthoruid(int authoruid) {
        this.authoruid = authoruid;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getAnnotation() {
        return annotation;
    }

    public void setAnnotation(String annotation) {
        this.annotation = annotation;
    }

    public String getTranslation() {
        return translation;
    }

    public void setTranslation(String translation) {
        this.translation = translation;
    }

    public String getWorkintro() {
        return workintro;
    }

    public void setWorkintro(String workintro) {
        this.workintro = workintro;
    }

    public String getRichtext() {
        return richtext;
    }

    public void setRichtext(String richtext) {
        this.richtext = richtext;
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo;
    }

    @Override
    public String toString() {
        return "Poems_Poem{" +
                "id=" + id +
                ", uid='" + uid + '\'' +
                ", name='" + name + '\'' +
                ", dynastyid=" + dynastyid +
                ", typeid=" + typeid +
                ", authoruid=" + authoruid +
                ", content='" + content + '\'' +
                ", annotation='" + annotation + '\'' +
                ", translation='" + translation + '\'' +
                ", workintro='" + workintro + '\'' +
                ", richtext='" + richtext + '\'' +
                ", memo='" + memo + '\'' +
                '}';
    }
}
