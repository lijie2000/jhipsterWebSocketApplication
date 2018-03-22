(function () {
    'use strict';

    angular
        .module('jhipsterWebSocketApplicationApp')
        .factory('Register', Register);

    Register.$inject = ['$resource'];

    function Register ($resource) {
        return $resource('api/register', {}, {});
    }
})();
