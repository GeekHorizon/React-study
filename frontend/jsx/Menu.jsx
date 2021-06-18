import React from 'react';
import ReactDOM from 'react-dom';

import Recipe from './Recipe';

class Menu extends React.Component {
    
    constructor(props) {
        super(props);
    }
    

    render() {
        const {title, recipes} = this.props;
        return (
           <article>
                <header>
                    <h1>{this.props.title}</h1>
                </header>
                <div className="recipes">
                    {recipes.map((recipe, i) => 
                        <Recipe key={i} {...recipe} />
                    )}
                </div>
           </article>
        );
    }

}

export default Menu;