package com.example.domain;

public class Sample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sample.id
     *
     * @mbggenerated Mon May 11 15:39:21 JST 2020
     */
    private Long id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sample.name
     *
     * @mbggenerated Mon May 11 15:39:21 JST 2020
     */
    private String name;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sample.age
     *
     * @mbggenerated Mon May 11 15:39:21 JST 2020
     */
    private Integer age;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sample.id
     *
     * @return the value of sample.id
     *
     * @mbggenerated Mon May 11 15:39:21 JST 2020
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sample.id
     *
     * @param id the value for sample.id
     *
     * @mbggenerated Mon May 11 15:39:21 JST 2020
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sample.name
     *
     * @return the value of sample.name
     *
     * @mbggenerated Mon May 11 15:39:21 JST 2020
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sample.name
     *
     * @param name the value for sample.name
     *
     * @mbggenerated Mon May 11 15:39:21 JST 2020
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sample.age
     *
     * @return the value of sample.age
     *
     * @mbggenerated Mon May 11 15:39:21 JST 2020
     */
    public Integer getAge() {
        return age;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sample.age
     *
     * @param age the value for sample.age
     *
     * @mbggenerated Mon May 11 15:39:21 JST 2020
     */
    public void setAge(Integer age) {
        this.age = age;
    }
}