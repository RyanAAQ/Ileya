const prompt = require("prompt-sync")();

const questionsA = ["expend energy, enjoy groups", "Interpret literally", "logical, thinking, questioning", "organized, orderly", "more outgoing, think out loud", "practical, realistic, experiential", "candid, straight forward, frank", "plan, schedule", "seek many tasks, interact with others", "standard, usual, conventional", "firm, tend to criticize", "regulated, structured", "external, communicative", "focus on here-and-now", "tough-minded, just", "preparation, plan ahead", "active, initiate", "facts, things, what is", "matter of fact, issue-oriented", "control, govern"];

const questionsB = ["conserve energy, enjoy one-on-one", "look for meaning and possibilities", "empathetic, feeling, accommodating", "flexible, adaptable", "more reserved, think to yourself", "imaginative, innovative, theoretical", "tactful, kind, encouraging", "unplanned, spontaneous", "seek private, solitary activities", "different, novel, unique", "gentle, tend to appreciate", "easy-going, live and let live", "internal, reticent, keep to yourself", "look to the future, big picture", "tender-hearted, merciful", "go with the flow, adapt as you go", "reflective, deliberate", "ideas, dreams, what could be", "sensitive, people-oriented", "latitude, freedom"];

const answers = new Array(20).fill("");

function main() {
    const name = String(prompt("What is your name? "));
    console.log("Hello " + name + "! Answer each question with A or B.\n");

    for (let i = 0; i < 20; i++) {
        console.log("Q" + (i + 1) + ":");
        console.log("  A. " + questionsA[i]);
        console.log("  B. " + questionsB[i]);

        while (true) {
            const ans = String(prompt("  Your answer: ")).trim().toUpperCase();
            if (ans === "A" || ans === "B") {
                answers[i] = ans;
                break;
            } else {
                console.log("  Expected A or B as Response, Please try again");
            }
        }
        console.log();
    }

    let eiA = 0;
    if (answers[0]  === "A") { eiA++; }
    if (answers[4]  === "A") { eiA++; }
    if (answers[8]  === "A") { eiA++; }
    if (answers[12] === "A") { eiA++; }
    if (answers[16] === "A") { eiA++; } // Fixed formatting here
    
    let snA = 0;
    if (answers[1]  === "A") { snA++; }
    if (answers[5]  === "A") { snA++; }
    if (answers[9]  === "A") { snA++; }
    if (answers[13] === "A") { snA++; }
    if (answers[17] === "A") { snA++; }

    let tfA = 0;
    if (answers[2]  === "A") { tfA++; }
    if (answers[6]  === "A") { tfA++; }
    if (answers[10] === "A") { tfA++; }
    if (answers[14] === "A") { tfA++; }
    if (answers[18] === "A") { tfA++; }

    let jpA = 0;
    if (answers[3]  === "A") { jpA++; }
    if (answers[7]  === "A") { jpA++; }
    if (answers[11] === "A") { jpA++; }
    if (answers[15] === "A") { jpA++; }
    if (answers[19] === "A") { jpA++; }
    
    let letter1, letter2, letter3, letter4;

    if (eiA >= 3) { letter1 = "E"; } else { letter1 = "I"; }
    if (snA >= 3) { letter2 = "S"; } else { letter2 = "N"; }
    if (tfA >= 3) { letter3 = "T"; } else { letter3 = "F"; }
    if (jpA >= 3) { letter4 = "J"; } else { letter4 = "P"; }

    const result = letter1 + letter2 + letter3 + letter4;

    console.log("========== YOUR RESPONSES ==========");
    for (let i = 0; i < 20; i++) {
        if (answers[i] === "A") {
            console.log("Q" + (i + 1) + ": A -> " + questionsA[i]);
        } else {
            console.log("Q" + (i + 1) + ": B -> " + questionsB[i]);
        }
    }

    console.log("\n" + name + ", your MBTI type is: " + result);
}

main(); 

