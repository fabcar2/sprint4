

      
	        $(function(){

                $("#buscar").click(function(){
                    var identificacion=$("#idReserva").val();
                    
                    var endpoint="http://localhost:8080/reserva/"+identificacion;
    
                    $.get(endpoint,function(reserva){
                       $("#cuerpotabla").html("");
    
                        var linea=`<tr><td>`+reserva.identificacion+`</td>
                            <td>`+reserva.cancha+`</td>
                            <td>`+reserva.fecha+`</td></tr>`;
                          
                        $("#cuerpotabla").append(linea)
    
    
                   })
           
    
                  })
               
               
                })