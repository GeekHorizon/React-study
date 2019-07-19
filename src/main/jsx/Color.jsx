import '../webapp/css/star.css';

import React from 'react';
import ReactDOM from 'react-dom';
import PropTypes from 'prop-types';
import StarRating from './StarRating';


    
export default class Color extends React.Component {
    constructor(props) {
        super(props);
    }

    componentWillMount() {
        this.style = {backgroundColor : '#CCC'};
    }

    shouldComponentUpdate(nextProps) {
        const {rating} = this.props;
        return rating !== nextProps.rating; 
    }

    componentWillUpdate(nextProps) {
        const {title, rating} = this.props;
        this.style = null;

        console.log(this._title);

        this._title.style.backgroundColor = "red";
        this._title.style.color = "white";
        alert(`${title} : 평점 ${rating} -> ${nextProps.rating}`);
    }

    componentDidUpdate(prevProps) {
        const {title, rating} = this.props;
        const status = (rating > prevProps.rating) ? '좋아짐' : '나빠짐';

        this._title.style.backgroundColor = "";
        this._title.style.color = "black";       
    }

    static propTypes = {
        title : PropTypes.string,
        rating : PropTypes.number, 
        color : PropTypes.string,
        onRate : PropTypes.func, 
        onRemove : PropTypes.func
    }

    static defaultProps = {
        title : undefined,
        rating : 0, 
        color : '#0000000',
        onRate : f => f, 
        onRemove : f => f
    }

    render() {
        const {title, color, rating} = this.props;
        const {onRate, onRemove} = this.props;
        
        return (
            <section className="color" style={this.style}>
                <h1 ref={hObj => this._title = hObj}>{title}</h1>
                <button onClick={onRemove}>X</button>
                <div className="color" style={{backgroundColor : color, height : '80px'}}>
                </div>
                <div>
                    <StarRating starSelected={rating} onRate={onRate} />
                </div>
            </section>
        )
    };
}