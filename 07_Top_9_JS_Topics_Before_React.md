# Namaste JavaScript – Season 2 | Bonus – Top 9 JavaScript Topics to Know Before Learning React JS in 2024

**Instructor:** Akshay Saini
**Published:** Premiered Dec 14, 2023
**Link:** https://www.youtube.com/watch?v=--VcGI9iPvw

---

## ⚠️ A note on sourcing (read this first)

For every other video in this playlist I pulled a detailed, timestamped breakdown to build these notes from. **For this specific video, YouTube blocked automated access and no third-party transcript/summary was available** — the only reliable source I could confirm was the video's own description, which is almost entirely a promo for the paid "Namaste React" course and does **not** list the actual 9 topics by name.

So rather than guess at Akshay Saini's exact list and present it as fact, this file gives you:
1. What's *confirmed* about the video, and
2. The **standard, widely-agreed-upon set of JS prerequisites for React** (compiled from multiple independent sources), which almost certainly overlaps heavily with what's covered.

**Recommendation:** watch this one video yourself with captions on (it's a roadmap-style video, not a deep-dive), and if you want, paste me the topic list/timestamps from the description or your own notes and I'll turn it into a fully detailed file matching the others.

## 1. Confirmed Facts

| Field | Value |
|---|---|
| Title | "Top 9 JavaScript topics to know before learning React JS in 2024" |
| Channel | Akshay Saini |
| Type | Roadmap / prerequisite-check video, positioned as a lead-in to the paid "Namaste React" course |
| Purpose (per description) | Help you self-assess whether your JS fundamentals are strong enough before starting React |

## 2. Commonly Cited JS-Before-React Topics (industry-standard list)

Since this video sits at the boundary between "core JS" (this playlist) and "React," the topics it almost certainly touches on are the same ones every experienced React educator flags as prerequisites:

| # | Topic | Why React needs it |
|---|---|---|
| 1 | **let/const, block scope, TDZ** | React/JSX code is all modern ES6+ syntax |
| 2 | **Arrow functions** | Used everywhere for handlers, callbacks, implicit `this` binding |
| 3 | **Destructuring (objects & arrays)** | `const { name, age } = props` is idiomatic React |
| 4 | **Spread/rest operators** | Immutable state updates: `setState({ ...state, x: 1 })` |
| 5 | **Array methods — `map`, `filter`, `reduce`, `find`** | Rendering lists (`items.map(item => <li>{item}</li>)`) is core React |
| 6 | **Template literals** | Dynamic strings/className building |
| 7 | **Promises & `async/await`** | Data fetching in `useEffect`, API calls |
| 8 | **`this` keyword & closures** | Needed for class components (legacy) and understanding hook behavior/stale closures |
| 9 | **ES Modules (`import`/`export`)** | Every React file is structured as a module |

> These 9 map almost one-to-one onto topics *already covered* earlier in this same Namaste JavaScript series (Season 1: closures, scope; Season 2: promises, async/await, this) — which is consistent with this video's role as a "checklist" bridging Season 2 into the separate Namaste React course.

## 3. Comparison Table — Where Each Topic Was Already Covered in This Playlist

| Topic | Covered in |
|---|---|
| Promises | Ep. 02, Ep. 03 (this playlist) |
| async/await | Ep. 04 (this playlist) |
| Promise APIs | Ep. 05 (this playlist) |
| `this` keyword | Ep. 06 (this playlist) |
| Closures, scope, let/const/TDZ | Namaste JavaScript **Season 1** (not in this playlist) |
| Destructuring, spread/rest, array methods, modules | Not covered in either season — worth studying separately before React |

## 4. Extra Interview/Self-Check Questions (topic-agnostic, answered)

**Q1. Why does React lean so heavily on `map()` instead of `for` loops for rendering lists?**
`map()` is an expression (returns a new array) that fits naturally inside JSX's `{ }` syntax, is declarative (describes *what* to render, not *how* to loop), and pairs naturally with React's need for a stable, keyed array of elements.

**Q2. Why is the spread operator (`...`) so central to React state updates?**
React (and Redux) rely on **immutability** to detect changes efficiently (shallow comparison). `{ ...oldState, updatedField: newValue }` creates a *new* object rather than mutating the old one in place, which is what lets React's diffing/re-render logic work correctly.

**Q3. Why does `useEffect` commonly use `async/await` awkwardly (via an inner function) instead of directly?**
`useEffect`'s callback must return either nothing or a cleanup function — it can't return a Promise directly (which is what an `async` function always returns, per Ep. 04). So the pattern is to define and immediately invoke an inner async function inside the effect.

## 5. Quick Reference Summary

| Take-away | Note |
|---|---|
| This video's exact content | Not independently verifiable — treat this file as a roadmap, not a transcript-based deep dive |
| What to actually study before React | ES6+ syntax (destructuring, spread, modules, arrow fns), array methods, and this playlist's own Promises/async-await/`this` content |
| Best next step in your prep | You already have deep notes on 4 of the 9 likely topics (Ep. 02–06 in this playlist) — fill the gap with destructuring/spread/modules/array-methods separately |
