const canvas = document.getElementById("myCanvas");
const ctx = canvas.getContext("2d");

// function getRandomHex() {
//     return Math.floor(Math.random() * 255)
// }
// function getRandomColor() {
//     let red = getRandomHex();
//     let blue = getRandomHex();
//     let green = getRandomHex();
//     let text = "rgb(" + red + "," + blue + "," + green +")";
//     return text;
// }

let x = canvas.width/2;
let y = canvas.height - 80;
let radius = 15;
let dx = 2;
let dy = 2;
let paddleHeight = 10;
let paddleWidth = 110;
let paddleX = (canvas.width - paddleWidth) / 2;
let paddleY = (canvas.height - paddleHeight);
let rightPress = false;
let leftPress = false;
let brick = [];
let brickRow = 3;
let brickColumn = 10;
let brickWidth = 75;
let brickHeight = 20;
let brickPadding = 10;
let brickOffSetTop = 30;
let brickOffSetLeft = 60;
let score = 0;

document.addEventListener('keydown', keyDown);
document.addEventListener('keyup', keyUp);
document.addEventListener('mousemove', mouseMove);
let requestID = requestAnimationFrame(draw);

for (let i = 0; i < brickColumn; i++) {
    brick[i] = [];
    for (let j = 0; j < brickRow; j++) {
        brick[i][j] = {
            x: 0,
            y: 0,
            status: 1
        };
    }
}
function keyDown(e) {
    if (e.key == 'ArrowRight' || e.key == 'Right') {
        rightPress = true;
    } else if (e.key == 'ArrowLeft' || e.key == 'Left') {
        leftPress = true;
    }
}
function keyUp(e) {
    if (e.key == 'ArrowRight' || e.key == 'Right') {
        rightPress = false;
    } else if (e.key == 'ArrowLeft' || e.key == 'Left') {
        leftPress = false;
    }
}
function mouseMove(e) {
    const relativeX = e.clientX - canvas.offsetLeft;
    if (relativeX > 0 && relativeX < canvas.width) {
        paddleX = relativeX - paddleWidth/2;
    }
}

function drawCircle() {
    ctx.beginPath();
    ctx.arc(x, y, radius, 0, Math.PI * 2);
    ctx.fillStyle = 'red';
    ctx.fill();
    ctx.closePath();
}
function drawPaddle() {
    ctx.beginPath();
    ctx.rect(paddleX, paddleY, paddleWidth, paddleHeight);
    ctx.fillStyle = 'blue';
    ctx.fill();
    ctx.closePath();
}
function drawBircks() {
    for (let i = 0; i < brickColumn; i++) {
        for (let j = 0; j < brickRow; j++) {
            if (brick[i][j].status == 1) {
                let brickX = i * (brickWidth + brickPadding) + brickOffSetLeft;
                let brickY = j * (brickHeight + brickPadding) + brickOffSetTop;
                brick[i][j].x = brickX;
                brick[i][j].y = brickY;
                ctx.beginPath();
                ctx.rect(brickX, brickY, brickWidth, brickHeight);
                ctx.fillStyle = 'blue';
                ctx.fill();
                ctx.closePath();
            }
        }
    }
    collisionDetection();
}

function drawScore() {
    ctx.font = '30p Arial';
    ctx.fillStyle = '#0095DD';
    ctx.fillText('Score: ' + score, 8, 20);
}

function collisionDetection() {
    for (let i = 0; i < brickColumn; i++) {
        for (let j = 0; j < brickRow; j++) {
            const b = brick[i][j];
            if (b.status == 1) {
                if (x + radius > b.x &&
                    x - radius < b.x + brickWidth && 
                    y + radius > b.y &&
                    y - radius < b.y + brickHeight) {
                    dy = -dy;
                    b.status = 0;
                    score++;
                    if (score == brickColumn * brickRow) {
                        alert('YOU WIN');
                        document.location.reload();
                        cancelAnimationFrame(requestID);
                    }
                }
            }
        }
    }
}

function draw() {
    ctx.clearRect(0, 0, canvas.width, canvas.height);
    drawCircle();
    drawPaddle();
    drawBircks();
    drawScore();
    if (x - radius < 0 || x + radius > canvas.width) {
        dx = -dx;
    }
    if (y - radius < 0) {
        dy = -dy;
    } else if (y + radius + dy >= canvas.height - paddleHeight) {
        if (y + radius + dy < canvas.height) {
            if (x > paddleX && x < paddleX + paddleWidth){
                dy = -dy;
            }
        } else {
            alert('GAME OVER');
            document.location.reload();
            cancelAnimationFrame(requestID);
        }
    }
    if (rightPress) {
        paddleX += 7;
        if (paddleX + paddleWidth > canvas.width) {
            paddleX = canvas.width - paddleWidth;
        }
    } else if (leftPress) {
        paddleX -= 7;
        if (paddleX < 0) {
            paddleX = 0;
        }
    }
    x += dx;
    y += dy;
    requestAnimationFrame(draw);
}

