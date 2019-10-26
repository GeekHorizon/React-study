import React from 'react';
import ReactDOM from 'react-dom';
import PropTypes from 'prop-types';
import HiddenMessage from './HiddenMessage';

class HiddenMessages extends React.Component {
    
    constructor(props) {
        super(props);
        this.state = {
            messages : [
                "Thymeleaf 도 요것 하나만 있으면 일단 bootRun으로 동작 가능하다.", 
                "bootRun을 하고 http://localhost:8080/hello 에 접속해보자.", 
                "외부 톰켓에 돌리기 위해서는 추가적인 작업이 조금 필요하다."
            ], 
            showing : -1
        };
    }

    componentWillMount() {
        this.interval = setInterval(() => {
            this.setState(prevState => {
                let {showing, messages} = prevState; 
                showing = (++showing >= messages.length) ? 0 : showing;
                return {showing};
            });
        }, 1000);
    }

    componentWillUnmount() {
        clearInterval(this.interval);
    }

    render() {
        const {messages, showing} = this.state; 
        return (
            <div className="hidden-messages">
                {messages.map((message, i) => 
                    <HiddenMessage key={i} hide={(i!==showing)}>               
                        {message}
                    </HiddenMessage>
                )}
            </div>
        );
    }

};

export default HiddenMessages;