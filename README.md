# Reservation-
<h2> Este é um código Java que implementa um sistema de reservas chamado "Reservation". A classe "Reservation" possui vários atributos, incluindo o número de convidados (guestCount), a capacidade do restaurante (restaurantCapacity), se o restaurante está aberto (isRestaurantOpen) e se a reserva está confirmada (isConfirmed).

Principais recursos do código:

  • O construtor da classe "Reservation" é chamado ao criar um objeto e recebe quatro parâmetros: "count" (número de convidados), "capacity" (capacidade do restaurante), "open" (restaurante aberto) e "confirmed" (reserva confirmada).
  <hr>
  • O construtor define os valores dos atributos com base nos parâmetros fornecidos.
Em seguida, o código verifica se o número de convidados é válido (entre 2 e 8) e imprime a mensagem "Invalid reservation!" se for inválido.
  <hr>
 • O método "confirmedReservation" verifica se a capacidade do restaurante é suficiente para acomodar o número de convidados e se o restaurante está aberto. Ele imprime a mensagem "Reservation confirmed" se a reserva for possível e define o atributo "isConfirmed" como true. Caso contrário, imprime a mensagem "Reservation denied" e define "isConfirmed" como false.
  <hr>
 • O método "informUser" imprime uma mensagem informando se a reserva foi confirmada ou não. Se não estiver confirmada, a mensagem indica que o usuário deve entrar em contato com o restaurante. Caso contrário, a mensagem indica que o usuário pode desfrutar da refeição.
  <hr>
 • O método "main" é usado para testar o código. Ele cria dois objetos "Reservation", passando diferentes valores para os parâmetros. Em seguida, chama os métodos "confirmedReservation" e "informUser" para cada objeto.

<br><br>
Este código pode ser usado como base para desenvolver um sistema mais complexo de reservas, adicionando recursos como verificação de disponibilidade por data e hora, gerenciamento de múltiplas reservas, integração com um banco de dados de restaurantes, entre outros.</h2>
