import React from 'react';
import ReactDOM from 'react-dom';
import Summary from './Summary';

class Recipe extends React.Component {
    
    constructor(props) {
        super(props);
    }

    render() {
        const {name, ingredients, steps} = this.props;
        return ( 
           <section id={name.toLowerCase().replace(/ /g, "-")}>
               <Summary ingredients={ingredients.length} steps={steps.length} title={name}/>
               
               <ul className="ingredients">
                   {ingredients.map((ingredient, i) => 
                        <li key={i}>{ingredient.name}</li>
                    )}

               </ul>
               <section className="instructions">
                   <h2>조리 절차</h2>
                   {steps.map((step, i) => 
                    <p key={i}>{step}</p>
                   )}
                </section>
           </section>
        );
    }

}
 
export default Recipe;