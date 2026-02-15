# SafeCar Insurance Management System

A Java-based insurance agency management simulation built using structured systems analysis and design methodologies.

**University of Macedonia**  
Department of Applied Informatics  
Course: Systems Analysis and Design  
Team: 5 Members  

---

## 📌 Executive Summary

SafeCar models the digital transformation of a small insurance agency that previously relied on manual workflows.

The project covers the full SDLC:

- Business analysis  
- UML modeling  
- Architectural design  
- Java implementation  
- UI prototyping  
- Agile task management with Jira  

The result is a working object-oriented Java prototype aligned with documented business requirements.

---

## 🎯 Problem Statement

The agency operated with:

- Paper forms  
- OpenOffice documents  
- Manual claim tracking  
- No centralized customer management  
- No reporting capability  

This led to:

- Data inconsistencies  
- Operational delays  
- Limited scalability  

SafeCar addresses these gaps through structured system design and automation.

---

## 🏗️ System Architecture

### Architecture Approach

- Use case-driven design  
- Object-oriented modeling  
- Layered responsibility separation  

### Modeling Techniques

- Use Case Diagrams and Narratives  
- Class Diagrams  
- Sequence Diagrams  
- Business Process Modeling AS-IS / TO-BE  
- Zachman Framework viewpoints  
- TOGAF-inspired architectural views  

---

## 💻 Technical Stack

| Area | Technology |
|------|------------|
| Language | Java |
| IDE | Eclipse 2023-09 |
| Modeling | Visual Paradigm |
| UI Prototyping | Figma |
| Version Control | Git + GitHub |
| Task Management | Jira (Kanban Board) |
| Documentation | PDF + UML Artifacts |

---

## 📊 Agile & Project Management

The team used Jira for structured task tracking.

Jira setup included:

- Kanban board  
- Epics aligned with SDLC phases  
- User stories derived from use cases  
- Task breakdown per module  
- Sprint reviews for validation  

Workflow example:

Backlog → In Progress → Code Review → Done

Artifacts tracked:

- Requirements  
- Design tasks  
- Implementation tickets  
- Bug reports  

This ensured traceability from business requirements to code.

---

## 🧠 Core Domain Model

| Class | Responsibility |
|-------|---------------|
| `SafeCar` | Application entry point |
| `Customer` | Customer entity |
| `Vehicle` | Vehicle entity |
| `InsurancePolicy` | Insurance plan definition |
| `InsuranceContract` | Policy contract management |
| `CustomerList` | In-memory customer aggregation |
| `VehicleList` | In-memory vehicle aggregation |

The implementation follows:

- Encapsulation  
- Separation of concerns  
- Clean OOP structure  

---

## 🔐 Access Control Model

Internal role-based system.

Roles:

- Director  
- Agent  
- Insurance Expert  

Clients do not access the system.

Permissions are enforced at logic level.

---

## 🔄 External System Interactions

Simulated integrations with:

- Police systems for accident reports  
- Insurance partners  
- Third-party assessors  

Modeled using sequence diagrams.

---

## 📈 Business Impact Simulation

Estimated impact after adoption:

- +30% sales growth  
- +20% revenue growth  
- 15.23% ROI  
- Significant reduction in manual errors  
- Improved strategic alignment  

---

## 📁 Project Structure
```text
src/
docs/
README.md
LICENSE
```


Full report available at:

[Full Project Report](docs/SystemsAnalysisAndDesignProject.pdf)

---

## 🧪 What This Project Demonstrates

- Translation of business needs into technical requirements  
- Structured architecture design  
- UML aligned with implementation  
- Working Java prototype delivery  
- Agile collaboration with Jira  
- Version control with Git workflows  

---

## 🔗 Resources

GitHub Repository  
https://github.com/AngelosFikias0/Safa_car_insurance_assignment.java  

Figma Prototype  
https://www.figma.com/board/V5BkCnkzIAC95bBLTpt9E5  

Visual Paradigm Documentation  
https://www.visualparadigm.com/support/documents/vpuserguide.jsp  

---

This project demonstrates structured systems thinking, disciplined execution, and alignment between business analysis and technical implementation.
