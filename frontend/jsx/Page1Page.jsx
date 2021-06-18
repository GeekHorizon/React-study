
 
import React from 'react';
import ReactDOM from 'react-dom';
 
class Page1Page extends React.Component {

    constructor(props) {
        super(props);

        this.date = "Test";
    }

    rendeer() {
        return <div className="page1">메인 페이지</div>;
    }




}
 
ReactDOM.render(<Page1Page/>, document.getElementById('root'));