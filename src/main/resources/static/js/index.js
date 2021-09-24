let socket;
let connectButton = document.getElementById("connectButton");
let disconnectButton = document.getElementById("disconnectButton");

connectButton.addEventListener("click", function () {
    socket = new WebSocket("ws://localhost:8089/chat");
});

disconnectButton.addEventListener("click", function () {
    if (socket) {
        console.log("close");
        socket.close();
    }
})
