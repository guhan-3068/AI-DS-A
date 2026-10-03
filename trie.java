class Trie {
public:
    struct Node {
        Node* child[26];
        bool end;

        Node() {
            end = false;
            for (int i = 0; i < 26; i++)
                child[i] = NULL;
        }
    };

    Node* root;

    Trie() {
        root = new Node();
    }

    void insert(string word) {
        Node* cur = root;

        for (char c : word) {
            int x = c - 'a';

            if (cur->child[x] == NULL)
                cur->child[x] = new Node();

            cur = cur->child[x];
        }

        cur->end = true;
    }

    bool search(string word) {
        Node* cur = root;

        for (char c : word) {
            int x = c - 'a';

            if (cur->child[x] == NULL)
                return false;

            cur = cur->child[x];
        }

        return cur->end;
    }

    bool startsWith(string prefix) {
        Node* cur = root;

        for (char c : prefix) {
            int x = c - 'a';

            if (cur->child[x] == NULL)
                return false;

            cur = cur->child[x];
        }

        return true;
    }
};
