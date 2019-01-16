let input = require('fs').readFileSync('./dev/stdin', 'utf8');
let lines = input.split('\n');

let n = parseInt(lines.shift());
let count;

const fib = (x) => {
    count++;
    if (x == 0 || x == 1) return x;
    else {
        return fib(x - 1) + fib(x - 2);
    }
}


while (n > 0) {
    count = -1;
    let x = parseInt(lines.shift());

    let fOfX = fib(x);

    console.log(`fib(${x}) = ${count} calls = ${fOfX}`);
    n--;
}