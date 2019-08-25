import org.springframework.cloud.contract.spec.Contract

Contract.make {
	request {
		method 'GET'
		urlPath(' /accounts/dummyaccount')
	}
	response { 
		status OK()
		body('{"name":"Test Account","lastSeen":null,"incomes":null,"expenses":null,"saving":null,"note":null}')
		headers { 
			contentType(applicationJsonUtf8())
		}
	}
}