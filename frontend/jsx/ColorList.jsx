import '../webapp/css/star.css';

import React from 'react';
import ReactDOM from 'react-dom';
import PropTypes from 'prop-types';
import Color from './Color';

const ColorList = ({colors = [], onRate = f => f, onRemove = f => f}) => {
    return (
        <div className="color-list">
            {
                (colors.length == 0) ? <p>색이 없습니다. (색을 추가해주세요)</p> : 
                colors.map(color => 
                    <Color key={color.id} {...color} onRate={(rating) => onRate(color.id, rating)} onRemove={() => onRemove(color.id)} />
                )
            }
        </div>
    );
}

export default ColorList;