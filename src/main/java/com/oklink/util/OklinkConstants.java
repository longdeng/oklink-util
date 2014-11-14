package com.oklink.util;

public class OklinkConstants {
	
	public static String preUrl = IniReader.getInstance(4).getValue("url","preUrl");
	public static String mainUrl = IniReader.getInstance(4).getValue("url","mainUrl");
	public static String tradeUrl = IniReader.getInstance(4).getValue("url","tradeUrl");
	
	public static String md5salt = IniReader.getInstance(4).getValue("salt","md5salt");
	
	public static int cookie_session_id_time=60*60*24*365;
	public static String cookie_session_name="coin_session_id_o";
	public static String cookie_session_login_info="coin_session_logininfo";
	public static String cookie_session_nike_name="coin_session_nikename";
	public static String cookie_user_id="coin_session_user_id";
	public static String cookie_domain=".okcoin.com";
	public static String session_key_pre="usersession";
	public static String session_key_admin="adminusersession";
	
}
