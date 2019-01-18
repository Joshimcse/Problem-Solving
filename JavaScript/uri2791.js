let input = require('fs').readFileSync('/dev/stdin', 'utf8');
let lines = input.split(' ');

if (lines[0] == 1) {
    console.log(1);
} else if (lines[1] == 1) {
    console.log(2);
} else if (lines[2] == 1) {
    console.log(3);
} else {
    console.log(4);
}