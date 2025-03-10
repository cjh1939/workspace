import "./App.css";

//리턴문 안에 html은 반드시 하나의 태그에 감싸져야 한다.
//컴포넌트는 반드시 대문자로 시작 ! // Header

function Header() {
  return (
    <div>
      <h3>header1</h3>
    </div>
  );
}

const Footer = () => {
  return (
    <div>
      <h3>footer1</h3>
    </div>
  );
};

function Content() {
  return (
    <div>
      <h3>content2</h3>
    </div>
  );
}

function App() {
  return (
    <>
      <Header />
      <Content />
      <Footer />
    </>
  );
}

export default App;
