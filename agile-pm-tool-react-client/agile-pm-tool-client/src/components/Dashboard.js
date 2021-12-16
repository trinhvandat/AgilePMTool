import React, { Component } from 'react'
import ProjectItem from './project/ProjectItem'

export class Dashboard extends Component {
    render() {
        return (
            <div>
                <h1>Hello! My name is Leonard.</h1>
                <ProjectItem />
            </div>
        );
    }
}

export default Dashboard;