package tr.edu.medipol.yazilimaraclari.yazilimortamaracFProje;

import org.springframework.web.bind.annotation.*;

import java.util.*;


@RestController
@RequestMapping("/hasta")
public class hastaRestApi {
	
	public static List<String> hastalar = new ArrayList<>();
	
	@GetMapping("/Listele")
	public List<String> listele() {
		return hastalar;
	}
	
	@PostMapping("/ekle")
	public String ekle(@RequestBody String ad) {
		hastalar.add(ad);
		return ad;
	}

}
