const input = require('fs').readFileSync('/dev/stdin', 'utf8');
const lines = input.split('\n');

let n, m, line, clonesTicket, valided, cloned;

while (true) {
    line = lines.shift().split(' ');

    validTicket = parseInt(line.shift());
    attendPerson = parseInt(line.shift());

    if (validTicket === 0 && attendPerson === 0) break;

    clonesTicket = 0;
    line = lines.shift().split(' ');
    valided = [];
    cloned = [];
    for (let i = 0; i < attendPerson; i++) {
        if (valided.includes(parseInt(line[i]))) {
            if (!cloned.includes(parseInt(line[i]))) cloned.push(parseInt(line[i]))
        } else valided.push(parseInt(line[i]));
    }
    console.log(cloned.length);
}