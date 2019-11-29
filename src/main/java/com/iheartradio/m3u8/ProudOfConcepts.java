package com.iheartradio.m3u8;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ProudOfConcepts {

	public static void main(String args[]) throws Exception {
		
		String line = "#EXTINF:-1 tvg-id=\"\" tvg-name=\"AL JAZEERA HD\" tvg-logo=\"http://212.8.253.112/logo/NEWS%26FACTUAL/ALJAZEERA.png\" group-title=\"AR | ARABIC NEWS & FACTUAL\",AL JAZEERA HD";
		//line = "otras cosas,";
		line = " tvg-id=\"\" tvg-name=\"AL JAZEERA HD\" tvg-logo=\"http://212.8.253.112/logo/NEWS%26FACTUAL/ALJAZEERA.png\" group-title=\"AR | ARABIC NEWS & FACTUAL\"";
		
		// final Matcher matcher = ParseUtil.match(Constants.EXTINF_PATTERN, line, "#EXTINF");
		// for (int i = 0; i <= matcher.groupCount(); i++) {
		//	System.out.println("Group " + i + ": " + matcher.group(i));
		// }

		Pattern pattern = Pattern.compile("([\\w-]+)=\"([^\"]*)\"");
		// pattern = Pattern.compile("^(.*), *(.*)$");
		Matcher matcher = pattern.matcher(line);
		
		while (matcher.find()) {
			for (int i = 0; i <= matcher.groupCount(); i++) {
				System.out.println("Group " + i + ": " + matcher.group(i));
			}
		}
	}

}
