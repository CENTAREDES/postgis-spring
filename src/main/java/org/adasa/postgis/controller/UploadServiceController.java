package sample.jsp;

package org.adasa.postgis.controller;

import java.util.Date;
import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UploadServiceController {

	@Value("${application.upload.dir:shapefile.shp}")
	private String source = "shapefile.shp";

	@RequestMapping("/upload-shapefile")
	public String upload(Map<String, Object> model) {
		model.put("time", new Date());
		model.put("source", this.source);
		return "upload-shapefile";
	}

	@RequestMapping("/commit")
	public String commit(Map<String, Object> model) {
		throw new RuntimeException("Not Implemented");
	}

}