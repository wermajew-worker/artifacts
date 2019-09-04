import org.springframework.cloud.contract.spec.Contract

Contract.make {
    request {
        method 'POST'
        urlPath('/uaa/users')
        body('''{
        "username" : "testusername",
        "password" : "testpassword"
            }'''
        )
        headers {
            contentType(applicationJsonUtf8())
        }
    }
    response {
        status OK()
    }
}
