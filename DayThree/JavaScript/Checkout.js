const prompt = require("prompt-sync")()

    let userItems = []
    let items = []
    let price = []
    let total = []
    
    console.log("=============== WELCOME TO RYAN'S SUPERMARKET ================");

    let index = 0;

    let customer = String(prompt("Enter customer name: "));

    do{
    userItems[index] = String(prompt("Enter product name: "));
    price[index] = Number(prompt("Enter Item Price: "));
    items[index] = Number(prompt("Enter quantity: "));
    total[index] = price[index] * items[index];
    index++;

    let choice = String(prompt("Add more items? (yes/no): ")).toLowerCase();
    if (choice === "no"){
    break;
    }
}
    while (index < 100);

    let totalPrice = 0;
    for(let count = 0; count < index; count++){
    totalPrice += total[count];
}

    let discount = totalPrice * 0.10;
    let vat = totalPrice * 0.075;
    let billTotal = totalPrice - discount + vat;

    console.log("\n===== RECEIPT =====");
    console.log("Customer name: " + customer);

    for (let count = 0; count < index; count++) {
    console.log(userItems[count] + " x" + items[count] + " @ " + price[count] + " = " + total[count]);
}

    console.log("-------------------------");
    console.log(`totalPrice: ${totalPrice.toFixed(2)}\n`);
    console.log(`Discount: ${discount.toFixed(2)}\n`);
    console.log(`VAT (7.5%%): ${vat.toFixed(2)}\n`);
    console.log(`Bill Total: ${billTotal.toFixed(2)}\n`);

    console.log
    let paid = Number(prompt("Amount Paid: "));

    let balance = paid - billTotal;

    console.log(`Balance: ${balance.toFixed(2)}\n`);
    console.log("==================");
    console.log("    THANK YOU");

