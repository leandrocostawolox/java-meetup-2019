package ar.com.wolox.javameetup2019.helpers;

public class CamelConstants {

	// Camel uris
	public static final String PROCESS_TEXT = "process";
	public static final String VALIDATE_TEXT = "direct:validate-text";
	public static final String RESULT_ENDPOINT = "mock:result";
	public static final String APPLICATION_JSON = "application/json";

	// Error tags
	public static final String CODE = "code";
	public static final String DETAIL = "detail";

	// Service headers
	public static final String HEADER_TEXT = "text";
	public static final String HEADER_LANG = "language";
	public static final String LANG_ES = "es";

	private CamelConstants() {

	}
}
