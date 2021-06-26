import React, {Component} from 'react';
import ReactDOM from 'react-dom';
import Home from './layouts/Home'
import store from './Store'
import {Provider} from 'react-redux'

class App extends Component {

    render() {

        return (
            <div>
                <Provider store={store}>
                    <Home />
                </Provider>
            </div
        );
    }
}