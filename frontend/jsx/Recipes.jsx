import React from 'react';
import ReactDOM from 'react-dom';

import Recipe from './Recipe';

class Recipes extends React.Component {
    
    constructor(props) {
        super(props);
    }

    render() {
        return (
           <div className="recipes">
               {this.props.recipes.map((recipe, i) => 
               <Recipe key={i} name={recipe.name}
                Ingredients={recipe.ingredients}
                steps={recipe.steps}/>
                )}
           </div>
        );
    }

}
 
export default Recipes;