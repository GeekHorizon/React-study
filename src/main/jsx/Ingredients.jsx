import React from 'react';
import ReactDOM from 'react-dom';

class Ingredients extends React.Component {
    
    constructor(props) {
        super(props);
    }

    render() {
        const {title, steps} = this.props;

        return (
           <section className="instructions">
               <h2>{title}</h2>
               {steps.map((step, i) =>
                <p key={i}>{step}</p>
                )}
           </section>
        );
    }

}
 
export default Ingredients;