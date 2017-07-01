function validateEmail(emailField){
    var reg = /^([A-Za-z0-9_\-\.])+\@([A-Za-z0-9_\-\.])+\.([A-Za-z]{2,4})$/;

    if (reg.test(emailField.value) == false) 
    {

    	document.getElementById("email-msg").innerHTML = "&#9888; Invalid Email Address";
    }

};

function validateMobile(mobile){
var val = mobile.value
if (/^\d{10}$/.test(val)) {
    // value is ok, use it
} else {
    document.getElementById("mobile-msg").innerHtml = "&#9888; Invalid mobile number; must be ten digits";
    number.focus()
    return false
}
};