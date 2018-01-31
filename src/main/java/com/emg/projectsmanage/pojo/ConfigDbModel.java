package com.emg.projectsmanage.pojo;

public class ConfigDbModel {
 
	private Integer id;
    
	private String ip;

    private Integer dbtype;

    private String connname;

    private String dbname;
    
    private String user;
    
    private String password;
    
    private String dbport;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
    
    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip == null ? null : ip.trim();
    }


    public Integer getDbtype() {
        return dbtype;
    }

    public void setDbtype(Integer type) {
        this.dbtype = type;
    }
    
    public String getConnname() {
        return connname;
    }

    public void setConnname(String name) {
        this.connname = name == null ? null : name.trim();
    }
    
    public String getDbname() {
        return dbname;
    }

    public void setDbname(String name) {
        this.dbname = name == null ? null : name.trim();
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user == null ? null : user.trim();
    }
    
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }
    
    public String getPort() {
        return dbport;
    }

    public void setPort(String port) {
        this.dbport = port == null ? null : port.trim();
    }
    
}
