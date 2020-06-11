package co.id.bpkh.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.id.bpkh.model.keberangkatan;
import co.id.bpkh.model.messageKemenag;
import co.id.bpkh.proxy.kemenagProxy;
import co.id.bpkh.repository.messageKemenagRepository;

@CrossOrigin(origins="*",maxAge=3600)
@RestController
public class kemenagController {
	@Autowired
	kemenagProxy proxy;

	@RequestMapping("/noporsi")
	public messageKemenag message() {
		//messageKemenag message;
		
		return  proxy.getdata(
				);
		//return message;
	}
}
