/*global cordova, module*/

module.exports = {
    disable: function (name, successCallback, errorCallback) {
        cordova.exec(successCallback, errorCallback, "Hello", "greet", [name]);
    }
};
