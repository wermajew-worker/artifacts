import org.springframework.cloud.contract.spec.Contract

Contract.make {
    request {
        method 'PUT'
        urlPath('/statistics/dummyaccount')
        body('''{
   "incomes":[
      {
         "title":"Salary",
         "amount":9100,
         "currency":"USD",
         "period":"MONTH"
      }
   ],
   "expenses":[
      {
         "title":"Grocery",
         "amount":10,
         "currency":"USD",
         "period":"DAY"
      }
   ],
   "saving":{
      "amount":1500,
      "currency":"USD",
      "interest":3.32,
      "deposit":true,
      "capitalization":false
   }
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
