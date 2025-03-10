import React, { useEffect, useState } from "react";
import axios from "axios";
import { useNavigate, useParams } from "react-router-dom";
import dayjs from "dayjs";
import styles from "./BoardDetail.module.css";

const BoardDetail = () => {
  const nav = useNavigate();
  const [boardDetail, setBoardDetail] = useState({});
  const prams = useParams();

  //댓글 삭제할 변수 
  const [deleteReply,setDeleteReply] = useState({});

  //해당게시글의 댓글 목록조회할 변수
  const [replyList, setReplyList] = useState([]);
  //등록할 댓글정보를 저장할 변수
  const [replyInfo, setReplyInfo] = useState({
    writer: "",
    content: "",
    boardNum: prams.boardNum,
  });

  //댓들 입력시 실행되는 함수
  const changeReplyInfo = (e) => {
    setReplyInfo({ ...replyInfo, [e.target.name]: e.target.value });
  };

  //board 정보 한명 조회
  useEffect(() => {
    axios
      .get(`/api/boards/${prams.boardNum}`)
      .then((res) => {
        console.log(res.data);
        setBoardDetail(res.data);
      })
      .catch((error) => {
        console.log(error);
      });
  }, [prams]);

  //댓글목록조회 ,마운트, + num값이 변경될때도 실행
  const [num, setNum] = useState(0);
  //댓글 목록
  useEffect(() => {
    axios
      .get(`/api/repLies/${prams.boardNum}`)
      .then((res) => {
        console.log(res.data);
        setReplyList(res.data);
      })
      .catch((error) => {
        console.log(error);
      });
  }, [num]);

  //조회쿼리 여러개 동시실행하기
  // useEffect(()=>{
  //   axios.all([
  //             axios.get(`/api/boards/${prams.boardNum}`),
  //             axios.get(`/api/repLies/${prams.boardNum}`)])
  //   .then(axios.spread((res1,res2)=>{
  //       console.log(res1.data);
  //       console.log(res2.data);
  //       setBoardDetail(res1.data);
  //       setReplyList(res2.data);
  //   }))
  //   .catch((error)=>{console.log(error)});
  // },[]);

  const [boardDelete, setBoardDelete] = useState([]);

  //게시글 삭제 함수 
  const Delt = () => {
    if (!confirm("정말 삭제 할까요 ?")) {
      return;
    }

    axios
      .delete(`/api/boards/${prams.boardNum}`, boardDelete)
      .then((res) => {
        alert("회원이 삭제되었습니다.");
        nav("/");
        setBoardDelete(res.data);
      })
      .catch((error) => {
        console.log(error);
      });
  };

  const change = (e) => {
    setBoardDetail({ ...boardDetail, [e.target.name]: e.target.value });
  };

  //댓글 등록기능 함수
  const insertReply = () => {
    axios
      .post("/api/repLies", replyInfo)
      .then((res) => {
        alert("댓글등록");
        setNum(num + 1);
        setReplyInfo({
          ...replyInfo,
          writer: '',
          content: ''
        })
      })
      .catch((error) => {});
  };

//댓글 삭제 함수 
  const delete1 = (replyNum)=>{
    const result = confirm("삭제?")
    if(!result){
      return;
    }
    axios.delete(`/api/repLies/${replyNum}`)
    .then((res)=>{
      //다시 댓글 목록을조회
      setNum(num +1);
      setDeleteReply(res.data);
    })
    .catch((error)=>{})
  }


  return (
    <div className={styles.datail_container}>
      <h1 className="m">게시글 상세 정보 페이지</h1>
      <div className="table-div">
        <table className={styles.datail_table}>
          <colgroup>
            <col width={"10%"} />
            <col width={"*"} />
            <col width={"10%"} />
            <col width={"15%"} />
            <col width={"10%"} />
            <col width={"15%"} />
          </colgroup>

          <tbody>
            <tr>
              <td>작성일</td>
              <td name="regDate">
                {dayjs(boardDetail.regDate).format("YYYY.MM.DD ")}
              </td>
              <td>작성자</td>
              <td name="writer">{boardDetail.writer}</td>
              <td>조회수</td>
              <td name="readCnt">{boardDetail.readCnt}</td>
            </tr>
            <tr>
              <td>제목</td>
              <td colSpan={5} className={styles.left_text}>
                {boardDetail.title}
              </td>
            </tr>
            <tr>
              <td>내용</td>
              <td colSpan={5} className={styles.left_text}>
                {boardDetail.content}
              </td>
            </tr>
          </tbody>
        </table>
      </div>
      <div className={styles.btn_div}>
        <button
          type="button"
          onClick={(e) => {
            nav("/");
          }}
        >
          목록가기
        </button>

        <button
          type="button"
          onClick={(e) => {
            nav(`/BoardUpdate/${prams.boardNum}`);
          }}
        >
          수정
        </button>

        <button
          type="button"
          onClick={(e) => {
            Delt();
            nav("/");
          }}
        >
          삭제
        </button>
      </div>
      <div className={styles.reg_reply_div}>
        <input
          type="text"
          placeholder="작성자"
          name="writer"
          value={replyInfo.writer}
          onChange={(e) => {
            changeReplyInfo(e);
          }}
        />

        <input
          type="text"
          placeholder="댓글 내용 입력"
          name="content"
          value={replyInfo.content}
          onChange={(e) => {
            changeReplyInfo(e);
          }}
        />

        <button type="button" onClick={(e) => insertReply()}>
          댓글등록
        </button>
      </div>

      <div className="reply-list-div">
        {replyList.map((reply, i) => {
          return (
            <div key={i} className={styles.reply}>
              <span>{reply.writer}</span>
              <span>{dayjs(reply.regDate).format("YYYY.MM.DD")}</span>
              <div>
                <p>{reply.content}</p>
                <button type="button" onClick={(e)=>{
                    delete1(reply.replyNum);
                }}>댓글 삭제</button>
              </div>
            </div>
          );
        })}
      </div>
    </div>
  );
};

export default BoardDetail;
