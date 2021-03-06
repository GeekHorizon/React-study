const webpack = require('webpack');
const path = require('path');
 
module.exports = {
    context: path.resolve(__dirname, 'jsx'),
    entry: {
        main: './Menu.jsx',
        page1: './Page1Page.jsx',
        app: './App.jsx',
        index: './Index.jsx'
    },
    devtool: 'sourcemaps',
    cache: true,
    output: {
        path: __dirname,
        filename: '../src/main/webapp/js/react/[name].bundle1.js'
    },
    mode: 'none',
    resolve : {
        extensions: ['.js', '.jsx']
    },
    module: {
        rules: [ {
            test: /\.jsx?$/,
            exclude: /(node_modules)/,
            use: {
                loader: 'babel-loader',
                options: {
                    presets: ['@babel/preset-env',
                              '@babel/react', {
                              'plugins': ['@babel/plugin-proposal-class-properties']}]

                }
            }
        }, {
            test: /\.css$/,
            use: [ 'style-loader', 'css-loader' ]
        } ]
    }
};