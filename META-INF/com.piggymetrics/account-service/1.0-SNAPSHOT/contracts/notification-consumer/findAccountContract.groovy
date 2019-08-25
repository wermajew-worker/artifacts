import org.springframework.cloud.contract.spec.Contract

Contract.make {
	request {
		method 'GET'
		urlPath(' /accounts/dummyaccount')
	}
	response { 
		status OK()
		body("Test Account")
		headers { 
			contentType(applicationJsonUtf8())
		}
	}
}