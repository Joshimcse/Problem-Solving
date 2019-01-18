let input = require('fs').readFileSync('/dev/stdin', 'utf8');
let lines = input.split('\n');

let n1 = parseInt(lines.shift())
let n2 = parseInt(lines.shift())

console.log((n1 * n2) + ((n1 - 1) * (n2 - 1)));
console.log(((n1 - 1) * 2) + ((n2 - 1) * 2));