const cart =["roomal","Ac","Tv","bartan"];

CreareOrder(cart,function (){
    proceedPayment(orderId);
});

const promise =CreareOrder(cart);

promise.then(function (){
    proceedPayment(orderId);
});