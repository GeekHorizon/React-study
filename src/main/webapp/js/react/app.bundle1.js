/******/ (function(modules) { // webpackBootstrap
/******/ 	// The module cache
/******/ 	var installedModules = {};
/******/
/******/ 	// The require function
/******/ 	function __webpack_require__(moduleId) {
/******/
/******/ 		// Check if module is in cache
/******/ 		if(installedModules[moduleId]) {
/******/ 			return installedModules[moduleId].exports;
/******/ 		}
/******/ 		// Create a new module (and put it into the cache)
/******/ 		var module = installedModules[moduleId] = {
/******/ 			i: moduleId,
/******/ 			l: false,
/******/ 			exports: {}
/******/ 		};
/******/
/******/ 		// Execute the module function
/******/ 		modules[moduleId].call(module.exports, module, module.exports, __webpack_require__);
/******/
/******/ 		// Flag the module as loaded
/******/ 		module.l = true;
/******/
/******/ 		// Return the exports of the module
/******/ 		return module.exports;
/******/ 	}
/******/
/******/
/******/ 	// expose the modules object (__webpack_modules__)
/******/ 	__webpack_require__.m = modules;
/******/
/******/ 	// expose the module cache
/******/ 	__webpack_require__.c = installedModules;
/******/
/******/ 	// define getter function for harmony exports
/******/ 	__webpack_require__.d = function(exports, name, getter) {
/******/ 		if(!__webpack_require__.o(exports, name)) {
/******/ 			Object.defineProperty(exports, name, { enumerable: true, get: getter });
/******/ 		}
/******/ 	};
/******/
/******/ 	// define __esModule on exports
/******/ 	__webpack_require__.r = function(exports) {
/******/ 		if(typeof Symbol !== 'undefined' && Symbol.toStringTag) {
/******/ 			Object.defineProperty(exports, Symbol.toStringTag, { value: 'Module' });
/******/ 		}
/******/ 		Object.defineProperty(exports, '__esModule', { value: true });
/******/ 	};
/******/
/******/ 	// create a fake namespace object
/******/ 	// mode & 1: value is a module id, require it
/******/ 	// mode & 2: merge all properties of value into the ns
/******/ 	// mode & 4: return value when already ns object
/******/ 	// mode & 8|1: behave like require
/******/ 	__webpack_require__.t = function(value, mode) {
/******/ 		if(mode & 1) value = __webpack_require__(value);
/******/ 		if(mode & 8) return value;
/******/ 		if((mode & 4) && typeof value === 'object' && value && value.__esModule) return value;
/******/ 		var ns = Object.create(null);
/******/ 		__webpack_require__.r(ns);
/******/ 		Object.defineProperty(ns, 'default', { enumerable: true, value: value });
/******/ 		if(mode & 2 && typeof value != 'string') for(var key in value) __webpack_require__.d(ns, key, function(key) { return value[key]; }.bind(null, key));
/******/ 		return ns;
/******/ 	};
/******/
/******/ 	// getDefaultExport function for compatibility with non-harmony modules
/******/ 	__webpack_require__.n = function(module) {
/******/ 		var getter = module && module.__esModule ?
/******/ 			function getDefault() { return module['default']; } :
/******/ 			function getModuleExports() { return module; };
/******/ 		__webpack_require__.d(getter, 'a', getter);
/******/ 		return getter;
/******/ 	};
/******/
/******/ 	// Object.prototype.hasOwnProperty.call
/******/ 	__webpack_require__.o = function(object, property) { return Object.prototype.hasOwnProperty.call(object, property); };
/******/
/******/ 	// __webpack_public_path__
/******/ 	__webpack_require__.p = "";
/******/
/******/
/******/ 	// Load entry module and return exports
/******/ 	return __webpack_require__(__webpack_require__.s = 19);
/******/ })
/************************************************************************/
/******/ ({

/***/ 19:
/***/ (function(module, exports) {

throw new Error("Module build failed (from ../node_modules/babel-loader/lib/index.js):\nSyntaxError: /Users/iris/Desktop/workspace/git/React-study/frontend/jsx/App.jsx: Unexpected token, expected \"jsxTagEnd\" (17:8)\n\n\u001b[0m \u001b[90m 15 |\u001b[39m                 \u001b[33m<\u001b[39m\u001b[33m/\u001b[39m\u001b[33mProvider\u001b[39m\u001b[33m>\u001b[39m\u001b[0m\n\u001b[0m \u001b[90m 16 |\u001b[39m             \u001b[33m<\u001b[39m\u001b[33m/\u001b[39m\u001b[33mdiv\u001b[39m\u001b[0m\n\u001b[0m\u001b[31m\u001b[1m>\u001b[22m\u001b[39m\u001b[90m 17 |\u001b[39m         )\u001b[33m;\u001b[39m\u001b[0m\n\u001b[0m \u001b[90m    |\u001b[39m         \u001b[31m\u001b[1m^\u001b[22m\u001b[39m\u001b[0m\n\u001b[0m \u001b[90m 18 |\u001b[39m     }\u001b[0m\n\u001b[0m \u001b[90m 19 |\u001b[39m }\u001b[0m\n    at Object._raise (/Users/iris/Desktop/workspace/git/React-study/frontend/node_modules/@babel/parser/lib/index.js:810:17)\n    at Object.raiseWithData (/Users/iris/Desktop/workspace/git/React-study/frontend/node_modules/@babel/parser/lib/index.js:803:17)\n    at Object.raise (/Users/iris/Desktop/workspace/git/React-study/frontend/node_modules/@babel/parser/lib/index.js:764:17)\n    at Object.unexpected (/Users/iris/Desktop/workspace/git/React-study/frontend/node_modules/@babel/parser/lib/index.js:9967:16)\n    at Object.expect (/Users/iris/Desktop/workspace/git/React-study/frontend/node_modules/@babel/parser/lib/index.js:9941:28)\n    at Object.jsxParseClosingElementAt (/Users/iris/Desktop/workspace/git/React-study/frontend/node_modules/@babel/parser/lib/index.js:5144:10)\n    at Object.jsxParseElementAt (/Users/iris/Desktop/workspace/git/React-study/frontend/node_modules/@babel/parser/lib/index.js:5163:37)\n    at Object.jsxParseElement (/Users/iris/Desktop/workspace/git/React-study/frontend/node_modules/@babel/parser/lib/index.js:5225:17)\n    at Object.parseExprAtom (/Users/iris/Desktop/workspace/git/React-study/frontend/node_modules/@babel/parser/lib/index.js:5232:19)\n    at Object.parseExprSubscripts (/Users/iris/Desktop/workspace/git/React-study/frontend/node_modules/@babel/parser/lib/index.js:10941:23)\n    at Object.parseUpdate (/Users/iris/Desktop/workspace/git/React-study/frontend/node_modules/@babel/parser/lib/index.js:10921:21)\n    at Object.parseMaybeUnary (/Users/iris/Desktop/workspace/git/React-study/frontend/node_modules/@babel/parser/lib/index.js:10899:23)\n    at Object.parseExprOps (/Users/iris/Desktop/workspace/git/React-study/frontend/node_modules/@babel/parser/lib/index.js:10756:23)\n    at Object.parseMaybeConditional (/Users/iris/Desktop/workspace/git/React-study/frontend/node_modules/@babel/parser/lib/index.js:10730:23)\n    at Object.parseMaybeAssign (/Users/iris/Desktop/workspace/git/React-study/frontend/node_modules/@babel/parser/lib/index.js:10693:21)\n    at /Users/iris/Desktop/workspace/git/React-study/frontend/node_modules/@babel/parser/lib/index.js:10660:39\n    at Object.allowInAnd (/Users/iris/Desktop/workspace/git/React-study/frontend/node_modules/@babel/parser/lib/index.js:12356:12)\n    at Object.parseMaybeAssignAllowIn (/Users/iris/Desktop/workspace/git/React-study/frontend/node_modules/@babel/parser/lib/index.js:10660:17)\n    at Object.parseParenAndDistinguishExpression (/Users/iris/Desktop/workspace/git/React-study/frontend/node_modules/@babel/parser/lib/index.js:11565:28)\n    at Object.parseExprAtom (/Users/iris/Desktop/workspace/git/React-study/frontend/node_modules/@babel/parser/lib/index.js:11268:21)\n    at Object.parseExprAtom (/Users/iris/Desktop/workspace/git/React-study/frontend/node_modules/@babel/parser/lib/index.js:5237:20)\n    at Object.parseExprSubscripts (/Users/iris/Desktop/workspace/git/React-study/frontend/node_modules/@babel/parser/lib/index.js:10941:23)\n    at Object.parseUpdate (/Users/iris/Desktop/workspace/git/React-study/frontend/node_modules/@babel/parser/lib/index.js:10921:21)\n    at Object.parseMaybeUnary (/Users/iris/Desktop/workspace/git/React-study/frontend/node_modules/@babel/parser/lib/index.js:10899:23)\n    at Object.parseExprOps (/Users/iris/Desktop/workspace/git/React-study/frontend/node_modules/@babel/parser/lib/index.js:10756:23)\n    at Object.parseMaybeConditional (/Users/iris/Desktop/workspace/git/React-study/frontend/node_modules/@babel/parser/lib/index.js:10730:23)\n    at Object.parseMaybeAssign (/Users/iris/Desktop/workspace/git/React-study/frontend/node_modules/@babel/parser/lib/index.js:10693:21)\n    at Object.parseExpressionBase (/Users/iris/Desktop/workspace/git/React-study/frontend/node_modules/@babel/parser/lib/index.js:10638:23)\n    at /Users/iris/Desktop/workspace/git/React-study/frontend/node_modules/@babel/parser/lib/index.js:10632:39\n    at Object.allowInAnd (/Users/iris/Desktop/workspace/git/React-study/frontend/node_modules/@babel/parser/lib/index.js:12350:16)");

/***/ })

/******/ });
//# sourceMappingURL=app.bundle1.js.map