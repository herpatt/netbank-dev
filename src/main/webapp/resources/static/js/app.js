$(document).ready(function() {
	$( ".js-transfer-type" ) .change(function () {    
		if( $(this).val() == 'E' ){
			$('.js-external-bank-type').removeClass('d-none');
			$('.js-external-bank-type input').val('');
		} else if( $(this).val() == 'I' ){
			$('.js-external-bank-type').addClass('d-none');
			$('.js-external-bank-type input').val('');
		}  
	});  	
});
