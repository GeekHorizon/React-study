import '../webapp/css/star.css';

import React from 'react';
import ReactDOM from 'react-dom';
import PropTypes from 'prop-types';

class Star extends React.Component {
    constructor(props) {
        super(props);
    }

    static propTypes = {
        selected : PropTypes.bool,
        onClick : PropTypes.func
    }

    render() {
        const {selected, onClick} = this.props;
        return (
            <div className={(selected) ? "star selected" : "star"} onClick={onClick}>
            </div>
        );
    }

};

export default Star;