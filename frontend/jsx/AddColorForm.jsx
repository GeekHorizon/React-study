import React from 'react';
import ReactDOM from 'react-dom';
import PropTypes from 'prop-types';

class AddColorForm extends React.Component {
    
    constructor(props) {
        super(props);
        this.submit = this.submit.bind(this);
    }

    submit(e) {
        e.preventDefault();
        const {_color, _title} = this.refs;
        this.props.onNewColor(_title.value, _color.value);
        _title.value = '';
        _color.value = '#000000';
        _title.focus();
    }

    static propTypes = {
        onNewColor : PropTypes.func
    }
    
    static defaultProps = {
        onNewColor : f => f
    }

    render() {
        return (
            <form onSubmit={this.submit}>
                <input ref="_title" type="text" placeholder="색이름..." required/>
                <input ref="_color" type="color" required/>
                <button>추가</button>
            </form>
        );
    }

};

export default AddColorForm;