package net.javaguides.springboot.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import net.javaguides.springboot.exception.ResourceNotFoundException;
import net.javaguides.springboot.model.ProductModel;
import net.javaguides.springboot.model.UserModel;
import net.javaguides.springboot.repository.ProductModelRepository;
import net.javaguides.springboot.repository.UserModelRepository;


@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api/")
public class UserModelController {

	@Autowired
	private UserModelRepository userModelRepository;
	
	
	// get all UserModels
	@GetMapping("/UserModels")
	public List<UserModel> getAllUserModels(){
		return userModelRepository.findAll();
	}		
	
	// create UserModel rest api
	@PostMapping("/signup")
	@CrossOrigin(origins = "http://localhost:4200")
	public UserModel createUserModel(@RequestBody UserModel userModel) {
		return userModelRepository.save(userModel);
	}

	@Autowired
	private ProductModelRepository productModelRepository;

	// get all UserModels
	@GetMapping("/ProductModels")
	public List<ProductModel> getAllProductModels(){
		return productModelRepository.findAll();
	}		
	
	// create UserModel rest api
	@PostMapping("/admin/addproduct")
	@CrossOrigin(origins = "http://localhost:4200")	
	public ProductModel createProductModel(@RequestBody ProductModel productModel) {
		System.out.println(productModel.toString());
		return productModelRepository.save(productModel);
	}

	
	/*
	// get UserModel by id rest api
	@GetMapping("/ProductModels")
	public ResponseEntity<ProductModel> getProductModelById(@PathVariable Long id) {
		ProductModel productModel = productModelRepository.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("UserModel not exist with id :" + id));
		return ResponseEntity.ok(productModel);
	}
	
	// update UserModel rest api
	
	@PutMapping("/UserModels/{id}")
	public ResponseEntity<UserModel> updateUserModel(@PathVariable Long id, @RequestBody UserModel UserModelDetails){
		UserModel UserModel = UserModelRepository.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("UserModel not exist with id :" + id));
		
		UserModel.setFirstName(UserModelDetails.getFirstName());
		UserModel.setLastName(UserModelDetails.getLastName());
		UserModel.setEmailId(UserModelDetails.getEmailId());
		
		UserModel updatedUserModel = UserModelRepository.save(UserModel);
		return ResponseEntity.ok(updatedUserModel);
	}
	
	// delete UserModel rest api
	@DeleteMapping("/UserModels/{id}")
	public ResponseEntity<Map<String, Boolean>> deleteUserModel(@PathVariable Long id){
		UserModel UserModel = UserModelRepository.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("UserModel not exist with id :" + id));
		
		UserModelRepository.delete(UserModel);
		Map<String, Boolean> response = new HashMap<>();
		response.put("deleted", Boolean.TRUE);
		return ResponseEntity.ok(response);
	}
	*/
	
	
}
