package com.masai.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.masai.Exception.FoodiyapaException;
import com.masai.Service.BookTableService;
import com.masai.models.BookTable;


@RestController
public class BookTableController {

	@Autowired
	private BookTableService tableS;
	
	@PostMapping("/table")
	public ResponseEntity<BookTable> addTable(@RequestBody BookTable table) {
		return new ResponseEntity<BookTable>(tableS.addTable(table),HttpStatus.CREATED);
	}
	
	@GetMapping("/tables")
	public ResponseEntity<List<BookTable>> getAllTable(){
		return new ResponseEntity<List<BookTable>>(tableS.getAllTable(),HttpStatus.OK);
	}
	
	@PostMapping("/table/{id}")
	public ResponseEntity<BookTable> updateTable(@PathVariable int id,@RequestParam String name) throws FoodiyapaException {
		return new ResponseEntity<BookTable>(tableS.updateTable(id, name),HttpStatus.OK);
	}
	
	@DeleteMapping("/table/{id}")
	public ResponseEntity<String> deleteTable(int id) throws FoodiyapaException{
		return new ResponseEntity<String>(tableS.deleteTable(id),HttpStatus.OK);
	}
}
