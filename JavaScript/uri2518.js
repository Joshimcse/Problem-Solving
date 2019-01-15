const input = require('fs').readFileSync('/dev/stdin', 'utf8');
const lines = input.split('\n');

while (true) {
    let n = parseInt(lines.shift());
    if (isNaN(n)) break;

    let line = lines.shift().split(' ');
    let h = parseInt(line.shift());
    let c = parseInt(line.shift());
    let l = parseInt(line.shift());

    console.log((((Math.sqrt((h * h) + (c * c))) * l * n) / 10000).toFixed(4));
}