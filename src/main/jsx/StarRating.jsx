import React from 'react';
import ReactDOM from 'react-dom';
import PropTypes from 'prop-types';
import Star from './Star';

class StarRating extends React.Component {
    
    constructor(props) {
        super(props);

        this.state = {
            starSelected : props.starSelected || 0
        }

        this.change = this.change.bind(this);
    }
 
    static propTypes = {
        totalStars : PropTypes.number,
        starSelected : PropTypes.number,
        onRate : PropTypes.func
    }

    static defaultProps = {
        totalStars : 5, 
        starSelected : 0, 
        onRate : f => f
    }

    change(starSelected) {
        this.setState({starSelected});
    }

    componentWillReceiveProps(nextProps) {
        console.log("TTTTTTTTTTTT");
    }

    render() {
        const {onRate} = this.props;
        const {totalStars} = this.props;
        const {starSelected} = this.state;
        
        return (
            <div className="star-rating">
                {[...Array(totalStars)].map((n, i) => 
                    <Star key={i} selected={i < starSelected} onClick={() => onRate(i+1)} />
                )}
                <p>별점 : {starSelected} / {totalStars}</p>
            </div>
        );
    }

};

const StarRating1 = ({totalStars = 5, starSelected = 0, onRate = f => f}) => {
   return (
        <div className="star-rating">
            {[...Array(totalStars)].map((n, i) => 
                <Star key={i} selected={i < starSelected} onClick={() => onRate(i+1)} />
            )}
            <p>별점 : {starSelected} / {totalStars}</p>
        </div>
    );
}


export default StarRating;