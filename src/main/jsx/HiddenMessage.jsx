import React from 'react';
import ReactDOM from 'react-dom';
import PropTypes from 'prop-types';

class HiddenMessage extends React.Component {
    
    constructor(props) {
        super(props);
        this.state = {
            hidden : typeof this.props.hide === "boolean" ? this.props.hide : true
        }

        this.hide = this.hide.bind(this);
        this.show = this.show.bind(this);
    }

    componentWillReceiveProps(nextProps) {
       
    }

    hide() {
        this.setState({hidden : true});
    }
    show() {
        this.setState({hidden : false});
    }

    render() {
        const {children} = this.props;
        const {hidden} = this.state;
        console.log(hidden);
        return (
            <p onMouseEnter={this.show} onMouseLeave={this.hide}>
                {(hidden) ? children.replace(/.*/, "x") : children}
            </p>
        );
    }

};

export default HiddenMessage;