import '../webapp/css/custom.css';
 
import React from 'react';
import ReactDOM from 'react-dom';
import PropTypes from 'prop-types';

class Summary extends React.Component {
    
    constructor(props) {
        super(props);
    }

    static propTypes = {
        ingredients : PropTypes.number,
        steps : PropTypes.number,
        title : (props, propName) => (typeof props[propName] !== 'string') ? new Error(`제목(title)은 문자열이어야 합니다.`) : 
            (props[propName].length > 20) ? new Error("제목(title)은 20자 이내여야 합니다.") : null
    }

    static defaultProps = {
        ingredients : 0,
        steps : 0,
        title : '[무제]'

    }

    render() {
        const {ingredients, steps, title} = this.props;

        return (
            <div className="summary">
                <h1>{title}</h1>
                <p>
                    <span>재료 {ingredients} 종류 | </span>
                    <span>총 {steps} 단계</span>
                </p>
            </div>
        );
    }

};

export default Summary;